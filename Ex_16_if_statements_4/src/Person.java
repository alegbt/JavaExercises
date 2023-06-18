public class Person {

    int age;
    int max = 80;
    int min = 5;

    public Person(){
        age = (int) Math.floor(Math.random()*(max-min+1)+min);
    }

    public String getLifeAge(){
        if(age<=12){
            return "Is a child";
        }else if(age>=13&&age<=19){
            return "is a teen";
        }else if(age>=20&&age<=59){
            return "is an adult";
        }else{return"senior adult";}
    }
}
