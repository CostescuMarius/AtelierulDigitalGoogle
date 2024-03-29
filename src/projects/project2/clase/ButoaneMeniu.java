package projects.project2.clase;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ButoaneMeniu {
	JButton b_joc_nou;
	JButton b_continua_joc;
	JButton b_exit;
	
	JButton b_usor;
	JButton b_mediu;
	JButton b_dificil;
	
	JButton b_meniu;
	JButton b_salvare;
	JButton b_anulare;
	
	JButton b_am_inteles;
	
	FereastraAplicatie referinta;
	Jucator referinta_jucator = Jucator.getInstance();
	
	JFrame f_dificultate;
	JFrame f_tutorial;
	
	public ButoaneMeniu(FereastraAplicatie fa)
	{
		referinta = fa;
		
		b_joc_nou = new JButton("Joc nou");
		b_continua_joc = new JButton("Continuare");
		b_exit = new JButton("Iesire");
		
		b_usor = new JButton("Usor");
		b_mediu = new JButton("Mediu");
		b_dificil = new JButton("Greu");
		
		b_meniu = new JButton("Meniu");
		b_salvare = new JButton("Salvare");
		b_anulare = new JButton("Anulare");
		
		b_am_inteles = new JButton("Am inteles");
		
		setare_butoane();
		
		adaugare_actiune_joc_nou();
		adaugare_actiune_continuare();
		adaugare_actiune_exit();
		
		adaugare_actiune_usor();
		adaugare_actiune_mediu();
		adaugare_actiune_greu();
		
		adaugare_actiune_inapoi();
		adaugare_actiune_salvare();
		adaugare_actiune_anulare();
		
		adaugare_actiune_am_inteles();
	}
	
	private void setare_butoane()
	{
		b_joc_nou.setFocusPainted(false);
		b_joc_nou.setBackground(Color.cyan);
		b_joc_nou.setForeground(Color.MAGENTA);
		b_joc_nou.setFont(new Font("Times New Roman", Font.BOLD, 35));
		b_joc_nou.setBorder(null);
		b_joc_nou.setBounds(690, 570, 150, 50);
		
		b_continua_joc.setFocusPainted(false);
		b_continua_joc.setBackground(Color.cyan);
		b_continua_joc.setForeground(new Color(35, 177, 77));
		b_continua_joc.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b_continua_joc.setBorder(null);
		b_continua_joc.setBounds(47, 800, 120, 30);
		
		b_exit.setFocusPainted(false);
		b_exit.setBackground(Color.cyan);
		b_exit.setForeground(Color.red);
		b_exit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b_exit.setBorder(null);
		b_exit.setBounds(1360, 800, 120, 30);
		
		b_usor.setFocusPainted(false);
		b_usor.setBackground(Color.black);
		b_usor.setForeground(Color.white);
		b_usor.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_usor.setBorder(null);
		b_usor.setBounds(145, 160, 100, 30);
		
		b_mediu.setFocusPainted(false);
		b_mediu.setBackground(Color.black);
		b_mediu.setForeground(Color.white);
		b_mediu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_mediu.setBorder(null);
		b_mediu.setBounds(145, 210, 100, 30);
		
		b_dificil.setFocusPainted(false);
		b_dificil.setBackground(Color.black);
		b_dificil.setForeground(Color.white);
		b_dificil.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_dificil.setBorder(null);
		b_dificil.setBounds(145, 260, 100, 30);
		
		b_meniu.setFocusPainted(false);
		b_meniu.setBackground(Color.black);
		b_meniu.setForeground(Color.white);
		b_meniu.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b_meniu.setBorder(null);
		b_meniu.setBounds(77, 60, 100, 30);
		
		b_salvare.setFocusPainted(false);
		b_salvare.setBackground(Color.black);
		b_salvare.setForeground(Color.white);
		b_salvare.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b_salvare.setBorder(null);
		b_salvare.setBounds(77, 110, 100, 30);
		
		b_anulare.setFocusPainted(false);
		b_anulare.setBackground(Color.black);
		b_anulare.setForeground(Color.white);
		b_anulare.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b_anulare.setBorder(null);
		b_anulare.setBounds(77, 160, 100, 30);
		
		
		b_am_inteles.setFocusPainted(false);
		b_am_inteles.setBackground(Color.black);
		b_am_inteles.setForeground(Color.white);
		b_am_inteles.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_am_inteles.setBorder(null);
		b_am_inteles.setBounds(145, 330, 100, 30);
	}
	
	public void adaugare_butoane_meniu(JPanel p)
	{
		p.add(b_joc_nou);
		
		p.add(b_continua_joc);
		
		p.add(b_exit);
	}
	
	public void adaugare_butoane_escape(JPanel p)
	{
		p.add(b_meniu);
		
		p.add(b_salvare);
		
		p.add(b_anulare);
	}
	
	private void adaugare_actiune_joc_nou()
	{
		b_joc_nou.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        		DateJson date = new DateJson();
        		date.citire_date_persoana("src//projects//project2//altele//situatie_start_joc.json");
        		
        		referinta.getScena3().curatare_lista();
        		
            	adaugare_fereastra_dificultate();
            }
        });
	}
	
	private void adaugare_fereastra_dificultate()
	{
		f_dificultate = new JFrame();
    	f_dificultate.setUndecorated(true);
    	f_dificultate.setBounds(560, 260, 400, 400);
    	f_dificultate.setVisible(true);
    	
    	JPanel p_dificultate = new JPanel();
    	p_dificultate.setBackground(Color.black);
    	p_dificultate.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.gray));
    	p_dificultate.setLayout(null);
    	
    	
    	JLabel l_dificultate1 = new JLabel("INCEPE UN JOC NOU");
    	l_dificultate1.setForeground(Color.white);
    	l_dificultate1.setFont(new Font("Times New Roman", Font.BOLD, 25));
    	l_dificultate1.setBounds(70, 40, 300, 50);
    	
    	JLabel l_dificultate2 = new JLabel("DIFICULTATE:");
    	l_dificultate2.setForeground(Color.white);
    	l_dificultate2.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	l_dificultate2.setBounds(125, 100, 300, 50);
    	
    	p_dificultate.add(l_dificultate1);
    	p_dificultate.add(l_dificultate2);
    	
    	p_dificultate.add(b_usor);
    	p_dificultate.add(b_mediu);
    	p_dificultate.add(b_dificil);
    	
    	f_dificultate.add(p_dificultate);
	}
	
	private void adaugare_actiune_usor()
	{
		b_usor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	referinta_jucator.setBani(100);
            	f_dificultate.dispatchEvent(new WindowEvent(f_dificultate, WindowEvent.WINDOW_CLOSING));
            	referinta.setare_scena2();
            	
            	adaugare_fereastra_tutorial();
            }
        });
	}
	
	private void adaugare_actiune_mediu()
	{
		b_mediu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	referinta_jucator.setBani(50);
            	f_dificultate.dispatchEvent(new WindowEvent(f_dificultate, WindowEvent.WINDOW_CLOSING));
            	referinta.setare_scena2();
            	
            	adaugare_fereastra_tutorial();
            }
        });
	}
	
	private void adaugare_actiune_greu()
	{
		b_dificil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	referinta_jucator.setBani(20);
            	f_dificultate.dispatchEvent(new WindowEvent(f_dificultate, WindowEvent.WINDOW_CLOSING));
            	referinta.setare_scena2();
            	
            	adaugare_fereastra_tutorial();
            }
        });
	}
	
	private void adaugare_fereastra_tutorial()
	{
		f_tutorial = new JFrame();
		f_tutorial.setUndecorated(true);
		f_tutorial.setBounds(560, 260, 400, 400);
		f_tutorial.setVisible(true);
    	
    	JPanel p_tutorial = new JPanel();
    	p_tutorial.setBackground(Color.black);
    	p_tutorial.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.gray));
    	p_tutorial.setLayout(null);
    	
    	JLabel l_tutorial1 = new JLabel("CUM SE JOACA?");
    	l_tutorial1.setForeground(Color.white);
    	l_tutorial1.setFont(new Font("Times New Roman", Font.BOLD, 25));
    	l_tutorial1.setBounds(100, 40, 300, 50);
    	
    	JLabel l_tutorial2 = new JLabel("<html>    Scopul jocului: Obtinerea a 1000 bancnote intr-un numar cat mai mic de zile. "
    			+ "<br> <br> Modalitati: <br> 1. Cumpararea produselor si vanzarea lor in urma cresterii pretului."
    			+ "<br> 2. Fabricarea de produse care valoreaza mai mult decat materialele din care sunt facute.</html>");
    	l_tutorial2.setForeground(Color.white);
    	l_tutorial2.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	l_tutorial2.setBounds(15, 100, 385, 200);
    	
    	p_tutorial.add(l_tutorial1);
    	p_tutorial.add(l_tutorial2);
    	
    	p_tutorial.add(b_am_inteles);
    	
    	f_tutorial.add(p_tutorial);
	}
	
	private void adaugare_actiune_am_inteles()
	{
		b_am_inteles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JFrame f_temp = (JFrame) SwingUtilities.getRoot(b_am_inteles);
            	f_temp.dispatchEvent(new WindowEvent(f_temp, WindowEvent.WINDOW_CLOSING));
            }
        });
	}
	
	private void adaugare_actiune_continuare()
	{
		b_continua_joc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        		DateJson date = new DateJson();
        		date.citire_date_persoana("src//projects//project2//altele//situatie_salvare_joc.json");
        		
        		referinta.setare_scena2();
            }
        });
	}
	
	private void adaugare_actiune_exit()
	{
		b_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
	}
	
	private void adaugare_actiune_inapoi()
	{
		b_meniu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JFrame f = (JFrame) SwingUtilities.getRoot(b_meniu);
            	f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
            	referinta.setare_meniu_principal();
            }
        });
	}
	
	private void adaugare_actiune_salvare()
	{
		b_salvare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        		DateJson date = new DateJson();
        		date.scriere_date_persoana("src//projects//project2//altele//situatie_salvare_joc.json");
            }
        });
	}
	
	private void adaugare_actiune_anulare()
	{
		b_anulare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JFrame f_temp = (JFrame) SwingUtilities.getRoot(b_anulare);
            	f_temp.dispatchEvent(new WindowEvent(f_temp, WindowEvent.WINDOW_CLOSING));
            }
        });
	}
}
