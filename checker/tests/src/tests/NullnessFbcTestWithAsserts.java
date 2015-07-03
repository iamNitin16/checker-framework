package tests;

import org.checkerframework.checker.nullness.AbstractNullnessChecker;
import org.checkerframework.framework.test.ParameterizedCheckerTest;

import java.io.File;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

/**
 * JUnit tests for the Nullness checker (that uses the Freedom Before Commitment
 * type system for initialization).
 */
public class NullnessFbcTestWithAsserts extends ParameterizedCheckerTest {

    public NullnessFbcTestWithAsserts(File testFile) {
        // TODO: remove forbidnonnullarraycomponents option once it's no
        // longer needed.  See issues 154, 322, and 433:
        // https://github.com/typetools/checker-framework/issues/154
        // https://github.com/typetools/checker-framework/issues/322
        // https://github.com/typetools/checker-framework/issues/433
        super(testFile,
                org.checkerframework.checker.nullness.NullnessChecker.class,
                "nullness",
                "-AcheckPurityAnnotations",
                "-AassumeAssertionsAreEnabled",
                "-Anomsgtext", "-Xlint:deprecation",
                "-Alint=forbidnonnullarraycomponents,"
                        + AbstractNullnessChecker.LINT_REDUNDANTNULLCOMPARISON);
    }

    @Parameters
    public static Collection<Object[]> data() {
        return testFiles("nullness-asserts");
    }

}
