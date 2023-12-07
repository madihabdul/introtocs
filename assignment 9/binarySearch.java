public class binarySearch {

public static int binarysearch (char[] a, char target) {
int left = 0;
int right = a.length-1;

while(left <= right) {
    int middle = (left + right)/2;
    if (a[middle] == target) {
        return middle; 
    } else if(target <a[middle]) {
        right = middle-1;
    } else {
        left = middle + 1;
    }
}
return -1; // target not found
}

}
