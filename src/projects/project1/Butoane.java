package projects.project1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Butoane {
    private JButton btnAdauga = new JButton();
    private JButton btnSterge = new JButton();
    private JButton btnModifica = new JButton();
    private JButton btnAdaugaN = new JButton();
    private JButton btnPersonalTotal = new JButton();
    private JButton btnPersonalActiv = new JButton();
    private JButton btnPersonalInactiv = new JButton();
    private JTextField text1 = new JTextField();
    private JTextField text2 = new JTextField();
    private JLabel label1;
    private JLabel label2;

    public Butoane(Evidenta Resurse)
    {
        creare_butoane(Resurse);
        creare_text_field();
    }

    private void creare_butoane(Evidenta Resurse)
    {
        btnAdauga = new JButton("Adauga Persoana");
        btnAdauga.setBounds(430, 45, 140, 20);
        functie_buton_adauga(Resurse);
        btnAdauga.setVisible(true);

        btnSterge = new JButton("Sterge Persoana");
        btnSterge.setBounds(430, 75, 140, 20);
        functie_buton_sterge(Resurse);
        btnSterge.setVisible(true);

        btnModifica = new JButton("Modifica Stare");
        btnModifica.setBounds(430, 105, 140, 20);
        functie_buton_modifica(Resurse);
        btnModifica.setVisible(true);

        btnAdaugaN = new JButton("Adauga n persoane");
        btnAdaugaN.setBounds(422, 670, 150, 20);
        functie_buton_adaugaN(Resurse);
        btnAdaugaN.setVisible(true);

        btnPersonalTotal = new JButton("Personal total");
        btnPersonalTotal.setBounds(10, 10, 120, 20);
        functie_buton_personaltotal(Resurse);
        btnPersonalTotal.setVisible(true);
        btnPersonalTotal.setBackground(new Color(66, 66, 66));
        btnPersonalTotal.setForeground(Color.white);
        btnPersonalTotal.setBorder(BorderFactory.createLineBorder(Color.white,1));

        btnPersonalActiv = new JButton("Personal activ");
        btnPersonalActiv.setBounds(140, 10, 120, 20);
        functie_buton_personalactiv(Resurse);
        btnPersonalActiv.setVisible(true);
        btnPersonalActiv.setBackground(new Color(66, 66, 66));
        btnPersonalActiv.setForeground(Color.white);
        btnPersonalActiv.setBorder(BorderFactory.createLineBorder(Color.white,1));

        btnPersonalInactiv = new JButton("Personal inactiv");
        btnPersonalInactiv.setBounds(270, 10, 140, 20);
        functie_buton_personalinactiv(Resurse);
        btnPersonalInactiv.setVisible(true);
        btnPersonalInactiv.setBackground(new Color(66, 66, 66));
        btnPersonalInactiv.setForeground(Color.white);
        btnPersonalInactiv.setBorder(BorderFactory.createLineBorder(Color.white,1));
    }

    private void functie_buton_adauga(Evidenta Resurse)
    {
        btnAdauga.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Persoana persoana_temp = generare_persoane_random();

                Resurse.AdaugaPersoana(persoana_temp);
            }
        });
    }

    private void functie_buton_sterge(Evidenta Resurse)
    {
        btnSterge.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String nume = text1.getText();
                Resurse.ScoatePersoana(nume);
            }
        });
    }

    private void functie_buton_modifica(Evidenta Resurse)
    {
        btnModifica.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String nume = text1.getText();

                Resurse.ModificaStarePersoana(nume);
            }
        });
    }


    private void functie_buton_personaltotal(Evidenta Resurse)
    {
        btnPersonalTotal.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Resurse.AfisarePersonalTotal();
                Resurse.evidenta_lista = 1;
            }
        });
    }

    private void functie_buton_personalactiv(Evidenta Resurse)
    {
        btnPersonalActiv.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Resurse.AfisarePersonalActiv();
                Resurse.evidenta_lista = 2;
            }
        });
    }

    private void functie_buton_personalinactiv(Evidenta Resurse)
    {
        btnPersonalInactiv.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Resurse.AfisarePersonalInactiv();
                Resurse.evidenta_lista = 3;
            }
        });
    }

    private void functie_buton_adaugaN(Evidenta Resurse)
    {
        btnAdaugaN.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int numar_persoane;
                String text_temp = text2.getText();

                if(text2.getText().trim().isEmpty())
                {
                    numar_persoane = 0;
                }
                else
                {
                    numar_persoane = Integer.parseInt(text_temp);
                }

                for(int i = 0; i < numar_persoane; i++)
                {
                    Persoana p_temp = generare_persoane_random();

                    Resurse.AdaugaPersoana(p_temp);
                }
            }
        });
    }

    public void adaugare_butoane_in_fereastra(JFrame f)
    {
        f.add(btnAdauga);

        f.add(btnSterge);


        f.add(btnModifica);

        f.add(btnPersonalTotal);

        f.add(btnPersonalActiv);

        f.add(btnPersonalInactiv);

        f.add(btnAdaugaN);
    }

    private void creare_text_field()
    {
        label1 = new JLabel();
        label1.setText("Nume");
        label1.setBounds(480, 140, 140, 20);
        label1.setForeground(new Color(128,0,128));
        Font font = new Font("Cambria", Font.BOLD, 16);
        label1. setFont(font);
        text1 = new JTextField(10);
        text1.setBounds(430, 160, 140, 20);
        text1.setVisible(true);


        label2 = new JLabel();
        label2.setText("Numar persoane");
        label2.setBounds(437, 693, 140, 20);
        label2.setForeground(new Color(128,0,128));
        label2.setFont(font);
        text2 = new JTextField(10);
        text2.setBounds(422, 713, 150, 20);
        text2.setVisible(true);
    }

    public void adaugare_text_in_fereastra(JFrame f)
    {
        f.add(label1);
        f.add(text1);

        f.add(label2);
        f.add(text2);
    }

    private String generare_string_random()
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        int length = 7;

        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(alphabet.length());

            char randomChar = alphabet.charAt(index);

            sb.append(randomChar);
        }

        String randomString = sb.toString();

        return randomString;
    }

    private String generare_competenta_random()
    {
        String alphabet = "BCJ+";

        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        int length = 3;

        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(alphabet.length());

            char randomChar = alphabet.charAt(index);

            sb.append(randomChar);
        }

        String randomString = sb.toString();

        return randomString;
    }

    private Persoana generare_persoane_random()
    {
        String nume = text1.getText();

        if(text1.getText().trim().isEmpty())
        {
            nume = generare_string_random();
        }

        Random rand = new Random();
        int nr_competente = 3 + rand.nextInt(4);


        String denumire[]= new String[nr_competente];
        int scor[] = new int[nr_competente];

        for(int i = 0; i < nr_competente; i++)
        {
            denumire[i] = generare_competenta_random();
            scor[i] = rand.nextInt(2);
        }

        Persoana p_temp = new Builder().seteazaNume(nume).seteazaActiv(true).seteazaCompetenta(nr_competente,
                denumire, scor).build();

        return p_temp;
    }
}