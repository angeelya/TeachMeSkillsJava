package work29.open_closed_principle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Report {
    private String fromAccount;
    private String toAccount;
    private BigDecimal sumRemittance;
    private String nameInputFile;
    private String statusRemittance;
    private LocalDateTime dataTime;

    public Report(String fromAccount, String toAccount, BigDecimal sumRemittance, String nameInputFile, String statusRemittance, LocalDateTime dataTime) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.sumRemittance = sumRemittance;
        this.nameInputFile = nameInputFile;
        this.statusRemittance = statusRemittance;
        this.dataTime = dataTime;
    }
}
