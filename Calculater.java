import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Calculater extends javax.swing.JFrame {

        //Object for use
	private String number1 = "";

	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b0;
	private JButton equal;
	private JButton root;
	private JButton square;
	private JButton log;
	private JButton naturalLog;
	private JButton c;
	private JButton sin;
	private JButton cos;
	private JButton tan;
	private JButton plus;
	private JButton subtract;
	private JButton multiplication;
	private JButton division;
	private JButton spot;
	private JPanel p1;
	private JPanel p2;
	private JTextField show;
	private static double Sum = 0;

        //Constructor
	public Calculater() {
                //Set the GUI
		super("Calculater");
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		this.setContentPane(p1);
		p1.setLayout(new GridLayout(4, 6, 10, 10));
		b1 = new JButton("1");
		p1.add(b1);

		b2 = new JButton("2");
		p1.add(b2);

		b3 = new JButton("3");
		p1.add(b3);

		plus = new JButton("+");
		p1.add(plus);

		sin = new JButton("sinx");
		p1.add(sin);

		c = new JButton("C");
		p1.add(c);

		b4 = new JButton("4");
		p1.add(b4);

		b5 = new JButton("5");
		p1.add(b5);

		b6 = new JButton("6");
		p1.add(b6);

		subtract = new JButton("-");
		p1.add(subtract);

		cos = new JButton("cosx");
		p1.add(cos);

		square = new JButton("x^2");
		p1.add(square);

		b7 = new JButton("7");
		p1.add(b7);

		b8 = new JButton("8");
		p1.add(b8);

		b9 = new JButton("9");
		p1.add(b9);

		multiplication = new JButton("X");
		p1.add(multiplication);

		tan = new JButton("tanx");
		p1.add(tan);

		log = new JButton("logx");
		p1.add(log);

		equal = new JButton("=");
		p1.add(equal);

		b0 = new JButton("0");
		p1.add(b0);

		spot = new JButton(".");
		p1.add(spot);

		division = new JButton("/");
		p1.add(division);

		root = new JButton("¡Ô");
		p1.add(root);

		naturalLog = new JButton("lnx");
		p1.add(naturalLog);

		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		this.setContentPane(p2);
                
		show = new JTextField();

                //Set the direction of the panel and textfield
		p2.add(show, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
 
                //ActionListener for using method.
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "1";
				show.setText(number1);
			}

		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "2";
				show.setText(number1);
			}

		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "3";
				show.setText(number1);
			}

		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "4";
				show.setText(number1);
			}

		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "5";
				show.setText(number1);
			}

		});
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "6";
				show.setText(number1);
			}

		});
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "7";
				show.setText(number1);
			}

		});
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "8";
				show.setText(number1);
			}

		});
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "9";
				show.setText(number1);
			}

		});
		b0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += "0";
				show.setText(number1);
			}

		});
		spot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number1 += ".";
				show.setText(number1);
			}

		});

		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					Sum = Double.parseDouble(number1);
					show.setText("");
					number1 = "";

				} catch (Exception a) {

				}

				equal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Sum += Double.parseDouble(number1);
							show.setText(Sum + "");
							number1 = "";
						} catch (Exception a) {

						}
					}
				});
			}

		});

		subtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(number1);
					show.setText(Sum + "");
					number1 = "";

				} catch (Exception a) {

				}

				equal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Sum -= Double.parseDouble(number1);
							show.setText(Sum + "");
							number1 = "";
						} catch (Exception a) {

						}
					}
				});
			}

		});
		multiplication.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					Sum = Double.parseDouble(number1);
					show.setText("");
					number1 = "";

				} catch (Exception a) {

				}

				equal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Sum *= Double.parseDouble(number1);
							show.setText(Sum + "");
							number1 = "";
						} catch (Exception a) {

						}
					}
				});
			}

		});
		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					Sum = Double.parseDouble(number1);
					show.setText("");
					number1 = "";

				} catch (Exception a) {

				}

				equal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Sum /= Double.parseDouble(number1);
							show.setText(Sum + "");
							number1 = "";
						} catch (Exception a) {

						}
					}
				});
			}

		});
		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Sum = 0;
				number1 = "";
				show.setText("");
			}

		});
		sin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.sin(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		cos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.cos(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		tan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.tan(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		log.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.log10(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		naturalLog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.log(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		root.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.sqrt(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		square.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.pow(Sum, 2) + "");
				} catch (Exception b) {

				}
			}

		});

	}

        //Main method
	public static void main(String[] args) throws IOException {
                //Code for setting the password 0000
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String x;
		int i;
                
                //Judge the password
		System.out.print("Enter the Password¡G");
		x = in.readLine();
		if (!(x.equals("0000"))) {
			System.out.println("I Fuck You !!");

		}
		else 
			
		try {
			Calculater frame = new Calculater();
			frame.setSize(500, 400);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		} catch (Exception e) {

		}

	}

}