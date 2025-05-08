package HW_5;
//Упражнение 5.1 (стр. 164)
class Вubblе {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978, 165,
        5623, 463, -9, 287, 49 };
    int a, b, t;
    int size;
    size = 10;
System.out.print("Иcxoдный массив:");
for(int i = 0; i < size; i++)
System.out.print(" " + nums[i]);
System.out.println();
// Реализовать алгоритм пузырьковой сортировки
for(a = 1; a < size; a++)
 for(b = size - 1; b >= a; b--) {
     if (nums[b - 1] > nums[b]) { // если требуемый порядок
         t = nums[b - 1];
         nums[b - 1] = nums[b];
         nums[b] = t;
     }
 }

System.out.print("Oтcopтиpoвaнный массив:");
for(int i = 0; i < size; i++)
         System.out.print(" " + nums[i]);
System.out.println();
     }
 }
