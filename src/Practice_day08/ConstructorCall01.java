package Practice_day08;


// Bir "ConstructorCall01" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, x ve y koordinatlarını alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak koordinatları ekrana yazdırın.

public class ConstructorCall01 {

    int x;
    int y;


public ConstructorCall01(int x,int y){

    this.x=x;
    this.y=y;
    display();


}

    public void display() {
        System.out.println("X :"+x+" Y: "+y+" dir");
    }


    public static void main(String[] args) {
    ConstructorCall01 ornek=new ConstructorCall01(3,125);

    }}