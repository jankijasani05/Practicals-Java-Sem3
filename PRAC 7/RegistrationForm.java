import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        Frame f = new Frame("Registration Form");
        
        // Header
        Label header = new Label("Registration Form");
        header.setBounds(20, 40, 200, 30);
        
        // Name
        Label lName = new Label("Name");
        lName.setBounds(20, 80, 100, 20);
        TextField tfName = new TextField("Ram");
        tfName.setBounds(130, 80, 300, 25);
        
        // Father Name
        Label lFName = new Label("Father Name");
        lFName.setBounds(20, 120, 100, 20);
        TextField tfFName = new TextField("Kumar");
        tfFName.setBounds(130, 120, 300, 25);
        
        // Age
        Label lAge = new Label("Age");
        lAge.setBounds(20, 160, 100, 20);
        TextField tfAge = new TextField("23");
        tfAge.setBounds(130, 160, 300, 25);
        
        // Gender (Radio Buttons require a CheckboxGroup)
        Label lGender = new Label("Gender");
        lGender.setBounds(20, 200, 100, 20);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cbMale = new Checkbox("Male", cbg, true);
        cbMale.setBounds(130, 200, 80, 20);
        Checkbox cbFemale = new Checkbox("Female", cbg, false);
        cbFemale.setBounds(220, 200, 80, 20);
        
        // Course (Choice dropdown)
        Label lCourse = new Label("Course");
        lCourse.setBounds(20, 240, 100, 20);
        Choice courseChoice = new Choice();
        courseChoice.add("Java");
        courseChoice.add("Python");
        courseChoice.setBounds(130, 240, 300, 25);
        
        // Hobbies (Checkboxes)
        Label lHobbies = new Label("Hobbies");
        lHobbies.setBounds(20, 280, 100, 20);
        Checkbox chk1 = new Checkbox("Drawing", true);
        chk1.setBounds(130, 280, 80, 20);
        Checkbox chk2 = new Checkbox("Singing", false);
        chk2.setBounds(220, 280, 80, 20);
        Checkbox chk3 = new Checkbox("Music", false);
        chk3.setBounds(310, 280, 70, 20);
        Checkbox chk4 = new Checkbox("Others", false);
        chk4.setBounds(390, 280, 70, 20);
        
        // Address (TextArea)
        Label lAddr = new Label("Address");
        lAddr.setBounds(20, 320, 100, 20);
        TextArea taAddr = new TextArea("234 - 1d First Street,\nAnna Main Road\nNamakkal", 3, 30);
        taAddr.setBounds(130, 320, 300, 80);
        
        // Buttons
        Button bSave = new Button("Save Details");
        bSave.setBounds(130, 420, 100, 30);
        Button bClear = new Button("Clear All");
        bClear.setBounds(250, 420, 100, 30);
        
        // Add all to frame
        f.add(header); f.add(lName); f.add(tfName);
        f.add(lFName); f.add(tfFName); f.add(lAge); f.add(tfAge);
        f.add(lGender); f.add(cbMale); f.add(cbFemale);
        f.add(lCourse); f.add(courseChoice);
        f.add(lHobbies); f.add(chk1); f.add(chk2); f.add(chk3); f.add(chk4);
        f.add(lAddr); f.add(taAddr);
        f.add(bSave); f.add(bClear);
        
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}