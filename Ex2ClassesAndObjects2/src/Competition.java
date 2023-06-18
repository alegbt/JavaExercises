public class Competition {
    public static void main(String[] args) {


CompetitionRules rulesMain = CompetitionRules.getRules();
        rulesMain.printRules();


Team teamA = new Team();
teamA.teamName = "roma";

Team teamB = new Team();
teamB.teamName = "lazio";


teamA.p1.name = "ale";
teamA.p1.programmingLanguage = "Java";
teamA.p1.yearsOfExperience = 0;


teamA.p2.name = "mario";
teamA.p2.programmingLanguage = "Phyton";
teamA.p2.yearsOfExperience = 1;



teamB.p1.name = "pino";
teamB.p1.programmingLanguage = "C++";
teamB.p1.yearsOfExperience = 2;

teamB.p2.name = "ugo";
teamB.p2.programmingLanguage = "Pascal";
teamB.p2.yearsOfExperience = 3;



        teamA.printTeamDetails();

        teamB.printTeamDetails();


    }
}
