package PlayerMultimediale;

import java.util.Scanner;

public class LettoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lascio commentati i metodi per dimostrare che funzionano correttamente

//RegistrazioneAudio tracciaAudio1 = new RegistrazioneAudio("The weekend", 0 , 4);
////        tracciaAudio1.play();
//        tracciaAudio1.alzaVolume();
////        tracciaAudio1.play();
//        tracciaAudio1.abbassaVolume();
////        tracciaAudio1.play();
//
//Video video1 = new Video("Youtube", 2 , 2 , 2);
////video1.play();
//video1.alzaLuminosita();
////video1.play();
//
//
//        Video video2 = new Video("Youtube", 1 , 4 , 5);
////        video2.play();
//        video2.alzaLuminosita();
////        video2.play();
//
//Immagine img1 = new Immagine("Gojo" ,10, 2);
////img1.show();
//img1.alzaLuminosita();
////img1.show();
//
//        Immagine img2 = new Immagine("Makito" ,3, 5);
////        img2.show();
//        img2.alzaLuminosita();
//        img2.show();
        

ElementoMultimediale [] arrayMultimediale = new ElementoMultimediale[5];


        for (int i = 0; i < arrayMultimediale.length; i++) {
            System.out.println("CREA 5 ELEMENTIMULTIMEDIALI : ");
            System.out.println("Inserisci il tipo di elemento da mettere nella posizione " + (i + 1));
            System.out.println("Scrivi '1' per Audio, '2' per Video, '3' per Immagine:");
            int sceltaTipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (sceltaTipo) {
                case 1:
                    System.out.println("Inserisci il volume:");
                    int volume = scanner.nextInt();
                    System.out.println("Inserisci la durata:");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine();
                    arrayMultimediale[i] = new RegistrazioneAudio(titolo, volume, durataAudio);
                    break;

                case 2:
                    System.out.println("Inserisci la durata:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    scanner.nextLine();
                    arrayMultimediale[i] = new Video(titolo, durataVideo, volumeVideo, luminosita);
                    break;

                case 3:
                    System.out.println("Inserisci la luminosità:");
                    int lum = scanner.nextInt();
                    System.out.println("Inserisci quante volte vuoi vederla :");
                    int visual= scanner.nextInt();
                    scanner.nextLine();
                    arrayMultimediale[i] = new Immagine(titolo, lum,visual);
                    break;

                default:
                    System.out.println("Scelta non valida, riprova.");
                    i--; //funzione che dovrebbe far ripetere il ciclo
            }
        }


while(true){
    System.out.println("scegli un numero tra 1 e 5 oppure 0 per chiudere il player");
    for(int i= 0 ; i<arrayMultimediale.length;i++){
        System.out.println((i+1)+" " + arrayMultimediale[i].getTitolo());
    }
    //faccio un sout vuoto per non lasciare le scritte appicicate
    System.out.println();
    int numeroScelto = scanner.nextInt();
 scanner.nextLine();
    if (numeroScelto == 0) {
        System.out.println("Grazie per aver provato i nostri elementi multimediali  a presto!");
        break;
    }

    if (numeroScelto >= 1 && numeroScelto <= 5) {
        ElementoMultimediale elemento = arrayMultimediale[numeroScelto - 1];
        if (elemento!= null) {
          elemento.esegui();
        }else{
            System.out.println("La scelta non è valida");
        }



}

}

    }}
