package Sonido;

import javax.sound.sampled.*;

public class reproducirAudio {

    public void Reproducir(String archivo) {
        try {
            // Cargar el archivo de sonido
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(reproducirAudio.class.getResource(archivo+".wav"));

            // Obtener la línea de clip de audio
            Clip clip = AudioSystem.getClip();

            // Abrir la línea de clip de audio con el archivo de sonido
            clip.open(audioInputStream);

            // Reproducir el sonido
            clip.start();

            // Esperar hasta que termine de reproducirse el sonido
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Cerrar la línea de clip de audio
            clip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}