/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git.pkg3;

/**
 *
 * @author ANNISA D YANSAF
 */
public class GIT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /** SOAL 1
         * Buatlah sebuah program untuk mencari median dari sebuah array satu dimensi. Print hasilnya ke dalam terminal
         */
        System.out.println("SOAL 1");
        int[] expArray = {1,3,2,5,6,8,5,7};
        int arraySize = expArray.length;
        if (arraySize % 2 == 0){
            int A1 = (arraySize / 2) - 1;
            int A2 = (arraySize / 2);
            double median = (expArray[A1] + expArray[A2]) / 2.00;
            System.out.println("The median from expArray is "+median);
        }else{
            var median = expArray[((arraySize - 1)/2)];
            System.out.println("The median from expArray is " + median);
        }
        
        /** SOAL 2
         * Buatlah sebuah program untuk mencari jumlah semuaangka yang ada di dalam array 2 dimensi. Print hasilnya kedalam terminal.
         */
        
        System.out.println("\nSOAL 2");
        int[][] numbers = {
            {1,3,4},
            {4,7,6},
            {2}
        };
        int sumNumbers = 0;
        for (int i = 0; i<numbers.length;i++){
            for(int j =0; j<numbers[i].length;j++){
                sumNumbers += numbers[i][j];
            }
        }
        System.out.println("The summation result of every number from the 2 dimension array is "+sumNumbers);
        
        /**SOAL 3
         * Buatlah sebuah program untuk menentukan apakahsuatu array adalah deret geometri atau bukan. Printhasilnya ke dalam terminal.
         */
        
        System.out.println("\nSOAL 3");
        int[] geometry = {2,6,18,54};
        boolean isGeometry = true;
        for (int i =1 ; i<(geometry.length-1); i++){
            if ((geometry[i]/geometry[i-1])!=(geometry[i+1]/geometry[i])){
            System.out.println("This array is not geometry");
            isGeometry = false;
             break;
            }
        }
        if(isGeometry){
            System.out.println("This array is geometry");
        }
        
        /**SOAL 4
         * Seorang pengajar sedang memeriksa ujian mahasiswa dan akan memberikan desc nilai dari A-E dengan ketentuan sebagai berikut:- Nilai 80 - 100: A- Nilai 65 - 79: B- Nilai 50 - 64: C- Nilai 35 - 49: D- Nilai 0 - 34: ETampilkan desc nilai dan nama siswa saat pengajar tersebut memasukkan nilai dan nama yang dia inginkan.Contoh 1:String nama = “Andhika”int nilai = 100//output yang diharapkannama: Andhika; score: A
         */
        
        System.out.println("\nSOAL 4");
        
        String name = "Andhika";
        int score = 30;
        
        if(100>=score && score>=80){
                System.out.println("Name = "+name+"; Score = A");
            }else if(79>=score && score >=65){
                System.out.println("Name = "+name+"; Score = B");
            }else if(64>=score && score >=50){
                System.out.println("Name = "+name+"; Score = C");
            }else if(49>=score && score >=35){
                System.out.println("Name = "+name+"; Score = D");
            }else{
                System.out.println("Name = "+name+"; Score = E");
            }
        
        /**SOAL 5
         * Tentukan angka terbesar dari sebuah array dan print hasilnya ke dalam terminal.
         */
        
        System.out.println("\nSOAL 5");
        int[] bigNum = {3,67,45,29,78,7,42};
        int Biggest = 0;
        for (int i = 0; i < bigNum.length; i++){
            if (bigNum[i]>Biggest){
                Biggest = bigNum[i];
            }
        }
        System.out.println("The biggest number is " + Biggest);
    }

    
}
