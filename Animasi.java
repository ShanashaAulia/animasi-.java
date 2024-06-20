// Shanasha Aulia Dianthi_231011401668
package tugaspert13; // Untuk nama packagenya

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;  //Untuk import kelas yang dibutuhkan untuk menjalankan kode

public class Animasi extends JPanel {
    private float xpos = 20f; //Koordinat X dari persegi panjang (tipe float)
    private float ypos = 20f; //Koordinat Y dari persegi panjang (tipe float)
    private float diff = 1.0f; //Nilai yang menunjukkan arah pergerakan persegi panjang (tipe float)

public Animasi() {
    new AnimasiRunnable(); //memulai thread animasi
    Metode paintComponent;
}

@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    Rectangle2D rect =
        new Rectangle2D. Float(xpos, ypos, 80f, 40f);
        g2d.fill(rect); //Membuat objek Rectangle2D.Float 

}

public static void main(String[] args) {
    JFrame frame = new JFrame("Animasi");  // Membuat JFrame baru dengan judul "Animasi"
    frame.add(new Animasi()); 
    frame.setSize(550, 450); //Menentukan ukuran frame
    frame.setLocationRelativeTo(null);
    frame.setVisible(true); //Menampilkan frame
}

    private static class Metode {

        public Metode() {
        }
    }

class AnimasiRunnable implements Runnable {
    private Thread runner;
    public AnimasiRunnable(){
    runner = new Thread(this);
    runner.start(); //berfungsi sebagai thread dan mengontrol animasi.
}
@Override
public void run(){
    while (true){
        repaint();
        if (xpos > 400f)
        diff = -1.0f; //Jika koordinat X persegi panjang melebihi batas layar, maka arah pergerakan akan dibalik.
         else if (xpos < 20f)
          diff = 1.0f; //Memperbarui koordinat X persegi panjang dengan jumlah perubahan arah.
        
          xpos += diff; // Memperbarui koordinat X persegi panjang dengan jumlah perubahan arah
          xpos += diff; // Melakukan update dua kali untuk mempercepat animasi

            try {
            Thread.sleep(30);

                }catch (InterruptedException e) {}
            }
        }
    }
}