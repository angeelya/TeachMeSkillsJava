package work29.open_closed_principle.before;

import work29.open_closed_principle.Report;

public class SaveReport {
    public void saveInFile(Report report)
    {
        System.out.println("Repost saved in file");
    }
    public void saveInDB(Report report)
    {
        System.out.println("Repost saved in DB");
    }
}
