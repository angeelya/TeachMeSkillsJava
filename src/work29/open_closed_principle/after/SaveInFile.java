package work29.open_closed_principle.after;

import work29.open_closed_principle.Report;
import work29.open_closed_principle.before.SaveReport;

public class SaveInFile implements Save {

    @Override
    public void save(Report report) {
        System.out.println("Report saved in file");
    }
}
