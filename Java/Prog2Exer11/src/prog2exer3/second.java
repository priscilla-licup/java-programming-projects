/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2exer3;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;

/**
 *
 * @author priscillalicup
 */
public class second {
    public String[][][] bye (String[][][] x, String[] y, int a) {
        for (int z=0; z<10; z++){
            if (x[a][z][0]==null){
                for (int b=0; b<8; b++) {
                    x[a][z][b]=y[b];
                }
                break;
            }
        }
        return x;
    }
    
    static int labcos;
    static int overcos;
    static int desprof;
    static int quan;
    static int cos;
    static String[] trans= new String [8];
    
    static int ordquan = 0;
    
    static int index;
    
    public void hello (String[] arr){
        trans[0] = "100";
        for (int x=0;x<3;x++){
            trans [x+1]=arr[x];
        }
        trans[4] = "1";
        trans[5] = String.valueOf((cos/quan)+labcos+overcos+desprof);
        trans[6] = String.valueOf(LocalDate.now());
        trans[7] = String.valueOf(index);
        
    }
    
    public void writecvs (String[][] cust){
        try {
          BufferedWriter br = new BufferedWriter (new FileWriter("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\customers.csv"));  
          StringBuilder sb = new StringBuilder();
          
          int y;
          for (int x=0; x<cust.length; x++){
              for (y=0; y<cust[0].length;y++){
                  if (cust[x][0]!=null){
                      sb.append(cust[x][y]);
                      sb.append(",");
                  }
              }
              sb.append("-");
              sb.append(",");
          }
          br.write(sb.toString());
          br.close();
        }
        catch (Exception ex) {
            System.out.println("no write customers");
        }  
    }
    
    public String[][] readcvs () {
        String [] fromfile = {};
        String[][] abc= new String[10][10];
        
        try {
          System.out.println ("bye error");
          BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\customers.csv")); 
          System.out.println ("hello error");
          String line;
          System.out.println ("1st error");
          
          while ((line=br.readLine())!=null) {
              fromfile = line.split(",");
              System.out.println ("2nd error");
          }
        }
        catch (Exception ex) {
            System.out.println("no read customers");
        }
        int a = 0;
        int z = 0;
        for(int x=0;x<fromfile.length;x++){
            if(fromfile[x].equals("-")){
               a++;
               z=0;
               System.out.println ("3rd error");
               continue;  
           }
            abc[a][z]=fromfile[x];
            z++;
            System.out.println ("4th error");
       }
        System.out.println ("5th error");
       return abc;
    }
    
    public void writecvsord (String[][][] ord){
        try {
          BufferedWriter br = new BufferedWriter (new FileWriter("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\orders.csv"));  
          StringBuilder sb = new StringBuilder();
          
          int y;
          for (int x=0; x<ord.length; x++){
              for (y=0; y<ord[x].length;y++){
                  if (ord[x][y][0]!=null){
                      for (int z=0; z<ord[0][0].length;z++) {
                          
                        sb.append(ord[x][y][z]);
                          
                          sb.append(",");
                      } 
                  }
                sb.append("-");
                sb.append(",");
              }
            sb.append("=");
            sb.append(",");  
          }
          br.write(sb.toString());
          br.close();
        }
        catch (Exception ex) {
            System.out.println("no write orders");
            ex.printStackTrace();
        }  
    }
    
    public String[][][] readcvsord () {
        String [] fromfile = {};
        String[][][] abc= new String[11][11][11];
        
        try {
          BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\orders.csv"));  
          String line;
          
          while ((line=br.readLine())!=null) {
              fromfile = line.split(",");
          }
        }
        catch (Exception ex) {
            System.out.println("no read orders");
        }
        int a = 0;
        int z = 0;
        int c=0;
        for(int x=0;x<fromfile.length;x++){
            switch (fromfile[x]) {
                case "-":
                   z++;
                   c=0;
                   continue;
                case "=":
                   a++;
                   z=0;
                   c=0;
                   continue;
            }
            abc[a][z][c]=fromfile[x];
            c++;
       }
       return abc;
    }
    
    public void writecvsprod (String[][] prod){
        try {
          BufferedWriter br = new BufferedWriter (new FileWriter("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\products.csv"));  
          StringBuilder sb = new StringBuilder();
          
          int y;
          for (int x=0; x<prod.length; x++){
              for (y=0; y<prod[0].length;y++){
                  if (prod[x][0]!=null){
                      sb.append(prod[x][y]);
                      sb.append(",");
                  }
              }
              sb.append("-");
              sb.append(",");
          }
          br.write(sb.toString());
          br.close();
        }
        catch (Exception ex) {
            System.out.println("no write products");
        }  
    }
    
    public String[][] readcvsprod () {
        String [] fromfile = {};
        String[][] abc= new String[5][7];
        
        try {
          BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\products.csv"));  
          String line;
          
          while ((line=br.readLine())!=null) {
              fromfile = line.split(",");
          }
        }
        catch (Exception ex) {
            System.out.println("no read products");
        }
        int a = 0;
        int z = 0;
        for(int x=0;x<fromfile.length;x++){
            if(fromfile[x].equals("-")){
               a++;
               z=0;
               continue;
           }
            abc[a][z]=fromfile[x];
            z++;
       }
       return abc;
    }
    
    public void writecvssto (String[][][] sto){
        try {
          BufferedWriter br = new BufferedWriter (new FileWriter("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\stockin.csv"));  
          StringBuilder sb = new StringBuilder();
          
          int y;
          for (int x=0; x<sto.length; x++){
              for (y=0; y<sto[x].length;y++){
                  if (sto[x][y][0]!= null){
                      for (int z=0; z<sto[0][0].length;z++) {
                        if (sto[x][y][z].equals("null")) {
                            sb.append("{}");
                        } else {
                        sb.append(sto[x][y][z]);
                        
                        }
                        sb.append(",");
                      } 
                  }
                sb.append("-");
                sb.append(",");
              }
            sb.append("=");
            sb.append(",");  
          }
          br.write(sb.toString());
          br.close();
        }
        catch (Exception ex) {
            System.out.println("no write stocks");
        }  
    }
    
    public String[][][] readcvssto () {
        String [] fromfile = {};
        String[][][] abc= new String[10][10][8];
        
        try {
          BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\stockin.csv"));  
          String line;
          
          while ((line=br.readLine())!=null) {
              fromfile = line.split(",");
          }
        }
        catch (Exception ex) {
            System.out.println("no read stocks");
        }
        int a = 0;
        int z = 0;
        int c=0;
        for(int x=0;x<fromfile.length;x++){
            switch (fromfile[x]) {
                case "-":
                   z++;
                   c=0;
                   continue;
                case "=":
                   a++;
                   z=0;
                   c=0;
                   continue;
            }
            abc[a][z][c]=fromfile[x];
            c++;
       }
       return abc;
    }
    
    public void writecvscost(){
        try{
            BufferedWriter br =  new BufferedWriter(new FileWriter("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\costs.csv"));
            StringBuilder sb = new StringBuilder();
        
            sb.append(labcos);
            sb.append(",");
            sb.append(overcos);
            sb.append(",");
            sb.append(desprof);
        
            br.write(sb.toString());
            br.close();
        }
        catch(Exception ex){  
            System.out.println("no write costs");
        }  
    }
    
    public String[] readcvscost(){
        String[] fromfile={"0","0","0"};
       
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Licup\\Downloads\\PM Programming\\csvfiles\\costs.csv"));
            String line;
            while((line = br.readLine()) != null){
                fromfile = line.split(",");
            }
        }catch(Exception ex){
            System.out.println("no read costs");
       }
        return fromfile;
    }
    
    public static void createCell(PdfPTable table, String text, int align, int colspan, Font font, int border, int r, int g, int b){
        PdfPCell cell = new PdfPCell(new Phrase(text.trim(),font));
        cell.setHorizontalAlignment(align);
        cell.setColspan(colspan);
        if (border==0){
            cell.setBorder(Rectangle.NO_BORDER);} 
        else{
            cell.setBorder(Rectangle.BOX);}
        
        if ("Computer Programming Store".equals(text)||"".equals(text)){
            cell.setMinimumHeight(30f);
        }
        
        cell.setBackgroundColor(new BaseColor(r,g,b));
        table.addCell(cell);
    }
    
}
