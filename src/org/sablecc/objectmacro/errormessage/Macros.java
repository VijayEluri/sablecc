/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

public class Macros {

    private VERSIONS version;

    public Macros(
            VERSIONS version) {

        if (version == null) {
            throw ObjectMacroException.versionNull();
        }

        this.version = version;
    }

    public Macros() {

        this.version = null;
    }

    public MSyntaxError newSyntaxError() {

        MSyntaxError mSyntaxError;

        mSyntaxError = new MSyntaxError(this);

        return mSyntaxError;
    }

    public MLexicalError newLexicalError() {

        MLexicalError mLexicalError;

        mLexicalError = new MLexicalError(this);

        return mLexicalError;
    }

    public MInternalError newInternalError() {

        MInternalError mInternalError;

        mInternalError = new MInternalError(this);

        return mInternalError;
    }

    public MCommandLineErrorHead newCommandLineErrorHead() {

        MCommandLineErrorHead mCommandLineErrorHead;

        mCommandLineErrorHead = new MCommandLineErrorHead(this);

        return mCommandLineErrorHead;
    }

    public MCommandLineErrorTail newCommandLineErrorTail() {

        MCommandLineErrorTail mCommandLineErrorTail;

        mCommandLineErrorTail = new MCommandLineErrorTail(this);

        return mCommandLineErrorTail;
    }

    public MInvalidArgument newInvalidArgument() {

        MInvalidArgument mInvalidArgument;

        mInvalidArgument = new MInvalidArgument(this);

        return mInvalidArgument;
    }

    public MMissingLongOptionOperand newMissingLongOptionOperand() {

        MMissingLongOptionOperand mMissingLongOptionOperand;

        mMissingLongOptionOperand = new MMissingLongOptionOperand(this);

        return mMissingLongOptionOperand;
    }

    public MMissingShortOptionOperand newMissingShortOptionOperand() {

        MMissingShortOptionOperand mMissingShortOptionOperand;

        mMissingShortOptionOperand = new MMissingShortOptionOperand(this);

        return mMissingShortOptionOperand;
    }

    public MInvalidLongOption newInvalidLongOption() {

        MInvalidLongOption mInvalidLongOption;

        mInvalidLongOption = new MInvalidLongOption(this);

        return mInvalidLongOption;
    }

    public MSpuriousLongOptionOperand newSpuriousLongOptionOperand() {

        MSpuriousLongOptionOperand mSpuriousLongOptionOperand;

        mSpuriousLongOptionOperand = new MSpuriousLongOptionOperand(this);

        return mSpuriousLongOptionOperand;
    }

    public MInvalidShortOption newInvalidShortOption() {

        MInvalidShortOption mInvalidShortOption;

        mInvalidShortOption = new MInvalidShortOption(this);

        return mInvalidShortOption;
    }

    public MSpuriousShortOptionOperand newSpuriousShortOptionOperand() {

        MSpuriousShortOptionOperand mSpuriousShortOptionOperand;

        mSpuriousShortOptionOperand = new MSpuriousShortOptionOperand(this);

        return mSpuriousShortOptionOperand;
    }

    public MUnknownTarget newUnknownTarget() {

        MUnknownTarget mUnknownTarget;

        mUnknownTarget = new MUnknownTarget(this);

        return mUnknownTarget;
    }

    public MInvalidArgumentCount newInvalidArgumentCount() {

        MInvalidArgumentCount mInvalidArgumentCount;

        mInvalidArgumentCount = new MInvalidArgumentCount(this);

        return mInvalidArgumentCount;
    }

    public MInvalidObjectmacroSuffix newInvalidObjectmacroSuffix() {

        MInvalidObjectmacroSuffix mInvalidObjectmacroSuffix;

        mInvalidObjectmacroSuffix = new MInvalidObjectmacroSuffix(this);

        return mInvalidObjectmacroSuffix;
    }

    public MInvalidIntermediateSuffix newInvalidIntermediateSuffix() {

        MInvalidIntermediateSuffix mInvalidIntermediateSuffix;

        mInvalidIntermediateSuffix = new MInvalidIntermediateSuffix(this);

        return mInvalidIntermediateSuffix;
    }

    public MMissingMacroFile newMissingMacroFile() {

        MMissingMacroFile mMissingMacroFile;

        mMissingMacroFile = new MMissingMacroFile(this);

        return mMissingMacroFile;
    }

    public MMacroNotFile newMacroNotFile() {

        MMacroNotFile mMacroNotFile;

        mMacroNotFile = new MMacroNotFile(this);

        return mMacroNotFile;
    }

    public MInputError newInputError() {

        MInputError mInputError;

        mInputError = new MInputError(this);

        return mInputError;
    }

    public MOutputError newOutputError() {

        MOutputError mOutputError;

        mOutputError = new MOutputError(this);

        return mOutputError;
    }

    public MSemanticErrorHead newSemanticErrorHead() {

        MSemanticErrorHead mSemanticErrorHead;

        mSemanticErrorHead = new MSemanticErrorHead(this);

        return mSemanticErrorHead;
    }

    public MUnknownMacro newUnknownMacro() {

        MUnknownMacro mUnknownMacro;

        mUnknownMacro = new MUnknownMacro(this);

        return mUnknownMacro;
    }

    public MPlainText newPlainText() {

        MPlainText mPlainText;

        mPlainText = new MPlainText(this);

        return mPlainText;
    }

    public MUnknownVersion newUnknownVersion() {

        MUnknownVersion mUnknownVersion;

        mUnknownVersion = new MUnknownVersion(this);

        return mUnknownVersion;
    }

    public MDuplicateDeclaration newDuplicateDeclaration() {

        MDuplicateDeclaration mDuplicateDeclaration;

        mDuplicateDeclaration = new MDuplicateDeclaration(this);

        return mDuplicateDeclaration;
    }

    public MDuplicateMacroVersionDeclaration newDuplicateMacroVersionDeclaration() {

        MDuplicateMacroVersionDeclaration mDuplicateMacroVersionDeclaration;

        mDuplicateMacroVersionDeclaration
                = new MDuplicateMacroVersionDeclaration(this);

        return mDuplicateMacroVersionDeclaration;
    }

    public MDuplicateOption newDuplicateOption() {

        MDuplicateOption mDuplicateOption;

        mDuplicateOption = new MDuplicateOption(this);

        return mDuplicateOption;
    }

    public MConflictingOption newConflictingOption() {

        MConflictingOption mConflictingOption;

        mConflictingOption = new MConflictingOption(this);

        return mConflictingOption;
    }

    public MUnknownOption newUnknownOption() {

        MUnknownOption mUnknownOption;

        mUnknownOption = new MUnknownOption(this);

        return mUnknownOption;
    }

    public MEndMismatch newEndMismatch() {

        MEndMismatch mEndMismatch;

        mEndMismatch = new MEndMismatch(this);

        return mEndMismatch;
    }

    public MUnknownParam newUnknownParam() {

        MUnknownParam mUnknownParam;

        mUnknownParam = new MUnknownParam(this);

        return mUnknownParam;
    }

    public MParamCyclicReference newParamCyclicReference() {

        MParamCyclicReference mParamCyclicReference;

        mParamCyclicReference = new MParamCyclicReference(this);

        return mParamCyclicReference;
    }

    public MSelfReference newSelfReference() {

        MSelfReference mSelfReference;

        mSelfReference = new MSelfReference(this);

        return mSelfReference;
    }

    public MUnusedTextBlock newUnusedTextBlock() {

        MUnusedTextBlock mUnusedTextBlock;

        mUnusedTextBlock = new MUnusedTextBlock(this);

        return mUnusedTextBlock;
    }

    public MUnusedParam newUnusedParam() {

        MUnusedParam mUnusedParam;

        mUnusedParam = new MUnusedParam(this);

        return mUnusedParam;
    }

    public MIncorrectNumberArgument newIncorrectNumberArgument() {

        MIncorrectNumberArgument mIncorrectNumberArgument;

        mIncorrectNumberArgument = new MIncorrectNumberArgument(this);

        return mIncorrectNumberArgument;
    }

    public MIncorrectArgumentType newIncorrectArgumentType() {

        MIncorrectArgumentType mIncorrectArgumentType;

        mIncorrectArgumentType = new MIncorrectArgumentType(this);

        return mIncorrectArgumentType;
    }

    public MCannotCreateDirectory newCannotCreateDirectory() {

        MCannotCreateDirectory mCannotCreateDirectory;

        mCannotCreateDirectory = new MCannotCreateDirectory(this);

        return mCannotCreateDirectory;
    }

    public MBodyTokenMisused newBodyTokenMisused() {

        MBodyTokenMisused mBodyTokenMisused;

        mBodyTokenMisused = new MBodyTokenMisused(this);

        return mBodyTokenMisused;
    }

    public MIndentTokenMisused newIndentTokenMisused() {

        MIndentTokenMisused mIndentTokenMisused;

        mIndentTokenMisused = new MIndentTokenMisused(this);

        return mIndentTokenMisused;
    }

    public MDuplicateMacroRef newDuplicateMacroRef() {

        MDuplicateMacroRef mDuplicateMacroRef;

        mDuplicateMacroRef = new MDuplicateMacroRef(this);

        return mDuplicateMacroRef;
    }

    public MIncorrectMacroType newIncorrectMacroType() {

        MIncorrectMacroType mIncorrectMacroType;

        mIncorrectMacroType = new MIncorrectMacroType(this);

        return mIncorrectMacroType;
    }

    public MInvalidInsert newInvalidInsert() {

        MInvalidInsert mInvalidInsert;

        mInvalidInsert = new MInvalidInsert(this);

        return mInvalidInsert;
    }

    public MMissingParameter newMissingParameter() {

        MMissingParameter mMissingParameter;

        mMissingParameter = new MMissingParameter(this);

        return mMissingParameter;
    }

    public MMissingInternal newMissingInternal() {

        MMissingInternal mMissingInternal;

        mMissingInternal = new MMissingInternal(this);

        return mMissingInternal;
    }

    public MIncorrectParameterType newIncorrectParameterType() {

        MIncorrectParameterType mIncorrectParameterType;

        mIncorrectParameterType = new MIncorrectParameterType(this);

        return mIncorrectParameterType;
    }
}
