package EsercizioStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // dichiariamo una variabile di tipo String che chiamo filePath e inizializziamola con il file di testo file.txt
        //per il percorso -> tasto dx -> Copy Path/Referces -> Absolute Path
//        String filePath = "C:\\Users\\Super uniqueorn\\IdeaProjects\\Esercizi\\src\\EsercizioStream\\file.txt";

        try{
//            //istanzio un oggetto con la Classe File e ci metto dentro filePath
//            File file = new File(filePath);
//            //criamo un oggetto con la classe FileReader , che prende com argomento un oggetto di tipo 'File'
//            //che sarà l'oggetto che verrà letto
//            FileReader fileReader = new FileReader(file);

            //posso mettere tutto dentro l'oggetto che istanzio con la classe BufferReader
            // la logica è questa :
            // bufferReader prende come argomento oggetti FileReader, che a loro volta prendono come argomento oggetti File, che a loro volta prendono
            //come argomento il percrso del file da leggere

            //La classe BufferReader è progettata per migliorare le prestazioni di lettura dei dati
            // da un flusso di input

            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:\\Users\\Super uniqueorn\\IdeaProjects\\Esercizi\\src\\EsercizioStream\\file.txt")));
            bufferedReader.lines().forEach(System.out::println);
            //bufferedReader.close();
            //fileReader.close();

        }catch(IOException e){
          e.printStackTrace();
            }
    }
}
