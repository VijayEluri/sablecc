#!/usr/bin/env bash

# This file is part of SableCC (http://sablecc.org/).
#
# See the NOTICE file distributed with this work for copyright information.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -e

ant -f ant-files/
mkdir -p tests/objectmacro/common/intermediate

java -jar lib/objectmacro.jar -d tests/objectmacro/common/intermediate/ tests/objectmacro/common/back-tests/back.objectmacro
java -jar lib/objectmacro-back.jar -d tests/objectmacro/java -p back.macro tests/objectmacro/common/intermediate/back.intermediate

java -jar lib/objectmacro.jar -d tests/objectmacro/common/intermediate/ tests/objectmacro/common/back-tests/cycle.objectmacro
java -jar lib/objectmacro.jar -d tests/objectmacro/common/intermediate/ tests/objectmacro/common/back-tests/tests.objectmacro
java -jar lib/objectmacro.jar -d tests/objectmacro/common/intermediate/ tests/objectmacro/common/random_case.objectmacro
java -jar lib/objectmacro.jar -d tests/objectmacro/common/intermediate/ tests/objectmacro/common/long_sequential_case.objectmacro
java -jar lib/objectmacro-back.jar -d tests/objectmacro/java -p back.cycle.example.macro tests/objectmacro/common/intermediate/cycle.intermediate
java -jar lib/objectmacro-back.jar -d tests/objectmacro/java -p back.cycle.macro tests/objectmacro/common/intermediate/tests.intermediate
java -jar lib/objectmacro-back.jar -d tests/objectmacro/java -p graph_generator.random_case tests/objectmacro/common/intermediate/random_case.intermediate
java -jar lib/objectmacro-back.jar -d tests/objectmacro/java -p graph_generator.long_sequential tests/objectmacro/common/intermediate/long_sequential_case.intermediate
javac -cp tests/objectmacro/java/ -d classes/ tests/objectmacro/java/back/*.java tests/objectmacro/java/back/cycle/*.java tests/objectmacro/java/graph_generator/*.java
#javac -cp tests/objectmacro/java/ -d classes/ tests/objectmacro/java/back/delta/macro/*.java tests/objectmacro/java/back/naif/macro/*.java
java -verbosegc -cp classes/ back.cycle.SequentialCase
#java -cp classes/ back.cycle.PerformanceRandomCase
