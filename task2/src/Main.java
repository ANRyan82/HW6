import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***��������� ����������� ����� �������***\n\n\n");

        System.out.println("������� ������ ���: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("������� ������ ���: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("������� ������ ���: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo �������� ������ ��������� ����.
       /* if (first > second && first > third){
            greatest = first;
        } else if (second > first && second > third) {
            greatest = second;
        }else {
            greatest = third;
        }
        if (first < second && first < third){
            smallest = first;
        } else if (second < first && second < third) {
            smallest = second;
        }else {
            smallest = third;
        }
        if((first > second && first < third)||(first < second && first > third)){
            average = first;
        } else if ((second > first && second < third)||(second < first && second > third)) {
            average = second;
        }else {
            average = third;
        }
        /*
        */
        /*if (first > second && first > third) {
            greatest = first;
        } else if (first < second && first < third) {
            smallest = first;
        } else {
            average = first;
        }
        if (second > first && second > third) {
            greatest = second;
        } else if (second < first && second < third) {
            smallest = second;
        } else {
            average = second;
        }
        if (third > second && third > second) {
            greatest = third;
        } else if (third < second && third < second) {
            smallest = third;
        } else {
            average = third;
        }*/
        greatest = first > second && first > third ? first : second > third ? second : third;
        smallest = first < second && first < third ? first : second < third ? second : third;
        if((first > second && first < third) || (first < second && first > third))
        {
            average = first;
        } else if ((second > first && second < third) || (second < first && second > third)) {
            average = second;
        }else {
            average = third;
        }
        //todo


        System.out.println("���������� ���: " + greatest);
        System.out.println("������� ���: " + average);
        System.out.println("���������� ���: " + smallest);
    }
}
