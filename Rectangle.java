public class Rectangle {
    /*
        Project Name:   Variables
        Created by: 	Melissa B.
        Created on: 	15/02/2017
    */

    private static int _length, _breadth;
    private static int _area, _perimeter;

    public static void main(String[] args) {
        _length = 10;
        _breadth = 15;

        _area = _length * _breadth;
        _perimeter = (_length + _breadth) * 2;

        System.out.println(_area);
        System.out.println(_perimeter);
    }
}
