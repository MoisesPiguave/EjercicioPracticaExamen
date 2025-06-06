package est.ups.poo.examen.E2;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio2 extends Frame {

    TextField cedulaField, nombreField, apellidoField;

    public Ejercicio2() {
        setSize(400, 250);
        setLayout(null);

        Button btnAgregar = new Button("Agregar");
        btnAgregar.setBounds(10, 40, 80, 25);
        add(btnAgregar);

        Button btnModificar = new Button("Modificar");
        btnModificar.setBounds(100, 40, 80, 25);
        add(btnModificar);

        Button btnEliminar = new Button("Eliminar");
        btnEliminar.setBounds(190, 40, 80, 25);
        add(btnEliminar);

        Label labelCedula = new Label("Cédula:");
        labelCedula.setBounds(30, 90, 80, 25);
        add(labelCedula);

        cedulaField = new TextField();
        cedulaField.setBounds(120, 90, 200, 25);
        add(cedulaField);

        Label labelNombre = new Label("Nombre:");
        labelNombre.setBounds(30, 120, 80, 25);
        add(labelNombre);

        nombreField = new TextField();
        nombreField.setBounds(120, 120, 200, 25);
        add(nombreField);

        Label labelApellido = new Label("Apellido:");
        labelApellido.setBounds(30, 150, 80, 25);
        add(labelApellido);

        apellidoField = new TextField();
        apellidoField.setBounds(120, 150, 200, 25);
        add(apellidoField);

        Button btnGuardar = new Button("Guardar");
        btnGuardar.setBounds(100, 190, 80, 25);
        add(btnGuardar);

        Button btnCancelar = new Button("Cancelar");
        btnCancelar.setBounds(200, 190, 80, 25);
        add(btnCancelar);

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cedula = cedulaField.getText();
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();

                System.out.println("Cédula: " + cedula);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}
