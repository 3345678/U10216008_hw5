import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculater extends javax.swing.JFrame {
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

	public Calculater() {
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

		root = new JButton("กิ");
		p1.add(root);

		naturalLog = new JButton("lnx");
		p1.add(naturalLog);

		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		this.setContentPane(p2);

		show = new JTextField();
		p2.add(show, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);