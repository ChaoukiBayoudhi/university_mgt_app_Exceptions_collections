package StudentManagement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Locale;

@Data
//@EqualsAndHashCode //redefines equals and hashcode methods using all attributes
//@EqualsAndHashCode(exclude = {"grade"}) //redefines equals and hashcode methods using all attributes except grade
@EqualsAndHashCode(onlyExplicitlyIncluded = true) //redefines equals and hashcode methods using only the attributes explicitly included
//@ToString //redefines toString method and returns a string with all attributes
//@ToString(exclude = {"photo","email"}) //redefines toString method and returns a string with all attributes except photo and email
@ToString(exclude = "photo") //redefines toString method and returns a string with all attributes except photo
public class Student{
    @EqualsAndHashCode.Include
        private String cin;
        private String name;
        private String familyName;
        private LocalDate birthDate;
        private double grade;
        private String email;

        private byte[] photo;
}
