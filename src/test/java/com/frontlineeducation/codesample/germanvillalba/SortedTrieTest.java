package com.frontlineeducation.codesample.germanvillalba;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.List;

/**
 * @author German Villalba
 * Unit test for SortedTrie.
 */
public class SortedTrieTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SortedTrieTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SortedTrieTest.class );
    }

    /**
     * Test Cases:
     */

    public void testGivenExample() {
        String[] data = {
                "1.2.3",
                "1.2.5",
                "1.5.6",
                "1.2.4",
                "2.5.6",
                "1.5.7",
                "2.5.3"
        };
        String[] expectedOutputArray = {
                "1",
                "--2",
                "----3",
                "----4",
                "----5",
                "--5",
                "----6",
                "----7",
                "2",
                "--5",
                "----3",
                "----6"
        };
        checkOutput(data,  expectedOutputArray);
    }

    public void testExampleDuplicates() {
        String[] data = {
                "A.B.C",
                "A.B.C",
                "A.B.C"
        };
        String[] expectedOutputArray = {
                "A",
                "--B",
                "----C"
        };
        checkOutput(data,  expectedOutputArray);
    }

    public void testExampleWithUpperCaseSingleCharacter() {
        String[] data = {
                "A.B.C",
                "A.B.D",
                "A.E.F"
        };
        String[] expectedOutputArray = {
                "A",
                "--B",
                "----C",
                "----D",
                "--E",
                "----F"
        };
        checkOutput(data,  expectedOutputArray);
    }

    public void testExampleWithLowerCaseSingleCharacter() {
        String[] data = {
                "a.b.c",
                "a.b.d",
                "a.e.f"
        };
        String[] expectedOutputArray = {
                "a",
                "--b",
                "----c",
                "----d",
                "--e",
                "----f"
        };
        checkOutput(data,  expectedOutputArray);
    }

    public void testExampleWithMixedCaseSingleCharacter() {
        String[] data = {
                "A.b.c",
                "a.b.d",
                "a.e.f"
        };
        String[] expectedOutputArray = {
                "A",
                "--b",
                "----c",
                "a",
                "--b",
                "----d",
                "--e",
                "----f"
        };
        checkOutput(data,  expectedOutputArray);
    }

    public void testEmpty() {
        String[] data = {};
        String[] expectedOutputArray = {};
        checkOutput(data,  expectedOutputArray);
    }

    public void testEmptyString() {
        String[] data = {""};
        String[] expectedOutputArray = {""};
        checkOutput(data,  expectedOutputArray);
    }

    public void testTwoLevelsSingle() {
        String[] data = {
                "Folder1.FolderA"
        };
        String[] expectedOutputArray = {
                "Folder1",
                "--FolderA"
        };
        checkOutput(data,  expectedOutputArray);
    }

    public void testThreeLevelsSingle() {
        String[] data = {
                "Folder1.FolderA.Folder2"
        };
        String[] expectedOutputArray = {
                "Folder1",
                "--FolderA",
                "----Folder2"
        };
        checkOutput(data,  expectedOutputArray);
    }

    public void testFourLevelsSingle() {
        String[] data = {
                "Folder1.FolderA.Folder2.FolderB"
        };
        String[] expectedOutputArray = {
                "Folder1",
                "--FolderA",
                "----Folder2",
                "------FolderB"
        };
        checkOutput(data,  expectedOutputArray);
    }


    public void testProjectPathSingleFile() {
        String[] data = {
            "Users.myuser.Documents.07_DEVELOPMENT.FrontlineEducationSolution.src.test.java.com.frontlineeducation.codesample.germanvillalba.SortedTrie"
        };
        String[] expectedOutputArray = {
            "Users",
            "--myuser",
            "----Documents",
            "------07_DEVELOPMENT",
            "--------FrontlineEducationSolution",
            "----------src",
            "------------test",
            "--------------java",
            "----------------com",
            "------------------frontlineeducation",
            "--------------------codesample",
            "----------------------germanvillalba",
            "------------------------SortedTrie"
        };
        checkOutput(data,  expectedOutputArray);
    }

    public void testProjectPathMultipleFiles() {
        String[] data = {
            "Users.myuser.Documents.07_DEVELOPMENT.FrontlineEducationSolution.src.main.java.com.frontlineeducation.codesample.germanvillalba.core.Trie",
            "Users.myuser.Documents.07_DEVELOPMENT.FrontlineEducationSolution.src.main.java.com.frontlineeducation.codesample.germanvillalba.SortedTrie",
            "Users.myuser.Documents.07_DEVELOPMENT.FrontlineEducationSolution.src.main.java.com.frontlineeducation.codesample.germanvillalba.core.TrieNode",
            "Users.myuser.Documents.07_DEVELOPMENT.FrontlineEducationSolution.src.main.java.com.frontlineeducation.codesample.germanvillalba.LongestMonotoneSubarray",
            "Users.myuser.Documents.07_DEVELOPMENT.FrontlineEducationSolution.src.test.java.com.frontlineeducation.codesample.germanvillalba.SortedTrieTest",
            "Users.myuser.Documents.07_DEVELOPMENT.FrontlineEducationSolution.src.test.java.com.frontlineeducation.codesample.germanvillalba.LongestMonotoneSubarrayTest"
        };
        String[] expectedOutputArray = {
            "Users",
            "--myuser",
            "----Documents",
            "------07_DEVELOPMENT",
            "--------FrontlineEducationSolution",
            "----------src",
            "------------main",
            "--------------java",
            "----------------com",
            "------------------frontlineeducation",
            "--------------------codesample",
            "----------------------germanvillalba",
            "------------------------LongestMonotoneSubarray",
            "------------------------SortedTrie",
            "------------------------core",
            "--------------------------Trie",
            "--------------------------TrieNode",
            "------------test",
            "--------------java",
            "----------------com",
            "------------------frontlineeducation",
            "--------------------codesample",
            "----------------------germanvillalba",
            "------------------------LongestMonotoneSubarrayTest",
            "------------------------SortedTrieTest"
        };
        checkOutput(data,  expectedOutputArray);
    }


    private void checkOutput(String[] data , String[] expectedOutputArray) {
        List<String> input = Arrays.asList(data);
        List<String> expectedOutput = Arrays.asList(expectedOutputArray);

        SortedTrie sortedTrie = new SortedTrie(input);
        List<String> actualOutput = sortedTrie.getOutput();
        sortedTrie.printToSystemOut();
        if (actualOutput.size() == expectedOutput.size()) {
            for (int i = 0; i < actualOutput.size(); i++) {
                assertEquals(actualOutput.get(i), expectedOutput.get(i));
            }
        } else {
            assertTrue(false);
        }
    }

}
