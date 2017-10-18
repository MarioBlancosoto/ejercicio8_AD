
package textodelimitado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TextoDelimitado {
        public static String[] cod ={"p1","p2","p3"};
        public static String[] desc ={"parafusos","cravos","tachas"};
        public static double[] prezo ={3,4,5};
        public static String [] contenido;
    public static void main(String[] args) {
    
        String ruta = "/home/local/DANIELCASTELAO/mblancosoto/NetBeansProjects/TextoDelimitado/Textodelimitado.txt";
       
       escribir(ruta);
       ler(ruta); 
    }
    

    
  public static void escribir(String ruta){
       
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(ruta)));
            for(int i=0;i<3;i++){
            pw.print(cod[i]+"\t");
            pw.print(desc[i]+"\t");
            pw.println(prezo[i]);
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(TextoDelimitado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  }
  
  public static void ler(String ruta){
       
            try {
                BufferedReader br = new BufferedReader(new FileReader(ruta));
               Product producto = new Product();
               while(br.ready()){
               contenido = br.readLine().split("\t");
                Product p3=new Product(contenido[0],contenido[1],Double.parseDouble(contenido[2]));
                   System.out.println(p3.toString());
                }
                
                
                br.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TextoDelimitado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TextoDelimitado.class.getName()).log(Level.SEVERE, null, ex);
            }
     
  }
}
