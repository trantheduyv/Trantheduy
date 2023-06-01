package QLBV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Demo {
    static LinkedHashSet dsBn= new LinkedHashSet();

    static void fakeData(){
        BenhNhan bn1= new BenhNhan("BV A","Nguyen Van A","HN","c", "Khong");
        BenhNhan bn2= new BenhNhan("BV A","Nguyen Van A","HN","a", "CCCCC");
        BenhNhan bn3= new BenhNhan("BV A","Nguyen Van A","HN","b", "Kddd");
        dsBn.add(bn1);
        dsBn.add(bn2);
        dsBn.add(bn3);

    }
    static void xuat(){
        Iterator ir = dsBn.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next().toString());
        }
    }
    static void nhap(){
        Scanner sc = new Scanner(System.in);
        int n=0;
        do{
            System.out.println("Nhap n benh nhan: ");
            n=sc.nextInt();
            sc.nextLine();
            for(int i =0;i<n;i++){
                System.out.println("Nhap bv thu "+ (i+1)+ ": ");
                System.out.println("Nhap ten bv: ");
                String tenBv= sc.nextLine();
                System.out.println("Nhap giam doc bv: ");
                String gd= sc.nextLine();
                System.out.println("Nhap dia chi bv: ");
                String dc= sc.nextLine();
                System.out.println("Nhap tien su BN: ");
                String ts= sc.nextLine();
                System.out.println("Nhap chuan doan BN: ");
                String cd= sc.nextLine();
                BenhNhan bn = new BenhNhan(tenBv,gd,dc,ts,cd);
                if(dsBn.contains(bn)){
                    System.out.println("trung du lieu");
                }else{
                    dsBn.add(bn);
                }
            }
        }while (n < 1 );
    }
    static void sort(){
        SortByTs s= new SortByTs();
        ArrayList<BenhNhan> list = new ArrayList<>(dsBn);
        Collections.sort(list,s);
        for (BenhNhan bn:list){
            System.out.println(bn);
        }

    }
    static void saveFile(){
        try{
            FileWriter fw= new FileWriter("bn.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Iterator ir = dsBn.iterator();
            while (ir.hasNext()){
                bw.write(ir.next().toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Lua File Thanh Cong");
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
    static void readFile(){
        try{
            FileReader fr= new FileReader("bn.txt");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while (true){
                line= br.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
            System.out.println("Doc File Thanh Cong!");
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
    public static void main(String[]args ){
        fakeData();
        xuat();
//        nhap();
//        xuat();
        System.out.println("DS SAU KHI SAP XEP");
        sort();
        saveFile();
        readFile();
    }
}
