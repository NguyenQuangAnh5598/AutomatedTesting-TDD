import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("case 2,2,2")
    void testCanhA2CanhB2CanhC2() {
        int aTest = 2;
        int bTest = 2;
        int cTest = 2;
        String expected = "Tam Giác Đều";
        String result = TriangleClassifier.getTriangle(aTest,bTest,cTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 2,2,3")
    void testCanhA2CanhB2CanhC3() {
        int aTest = 2;
        int bTest = 2;
        int cTest = 3;
        String expected = "Tam Giác Cân";
        String result = TriangleClassifier.getTriangle(aTest,bTest,cTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 3,4,5")
    void testCanhA3CanhB4CanhC5() {
        int aTest = 3;
        int bTest = 4;
        int cTest = 5;
        String expected = "Tam Giác Thường";
        String result = TriangleClassifier.getTriangle(aTest,bTest,cTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 8,2,3")
    void testCanhA8CanhB2CanhC3() {
        int aTest = 8;
        int bTest = 2;
        int cTest = 3;
        String expected = "Không Phải Là Tam Giác";
        String result = TriangleClassifier.getTriangle(aTest,bTest,cTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case -1,2,1")
    void testCanhACanhBCanhC() {
        int aTest = -1;
        int bTest = 2;
        int cTest = 1;
        String expected = "Không Phải Là Tam Giác";
        String result = TriangleClassifier.getTriangle(aTest,bTest,cTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 0,1,1")
    void testCanhA0CanhB1CanhC1() {
        int aTest = -1;
        int bTest = 2;
        int cTest = 1;
        String expected = "Không Phải Là Tam Giác";
        String result = TriangleClassifier.getTriangle(aTest,bTest,cTest);
        assertEquals(expected,result);
    }
}