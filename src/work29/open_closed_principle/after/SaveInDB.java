package work29.open_closed_principle.after;

import work29.open_closed_principle.Report;

public class SaveInDB implements Save{
    @Override
    public void save(Report report) {
        System.out.println("Report saved in DB");
    }
}
