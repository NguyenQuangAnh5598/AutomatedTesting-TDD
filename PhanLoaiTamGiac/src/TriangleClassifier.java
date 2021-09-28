public class TriangleClassifier {
    public static String getTriangle(int a, int b, int c) {
        String triangleClassifier = "Không Phải Là Tam Giác";
        if ((a+b) > c && (a+c) > b && (b+c) > a ) {
            if (a == b && a == c) {
                triangleClassifier = "Tam Giác Đều";
            }else if (a == b || a == c || b == c) {
                triangleClassifier = "Tam Giác Cân";
            } else{
                triangleClassifier = "Tam Giác Thường";
            }
        }
        return triangleClassifier;
    }
}
