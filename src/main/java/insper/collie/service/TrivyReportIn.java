package insper.collie.service;

import lombok.Builder;
import lombok.experimental.Accessors;



import java.util.List;




@Builder
@Accessors(fluent = true, chain = true)
public record TrivyReportIn (
    List<TrivyReport> reports
) {


    public static record TrivyReport (
        String Target,
        String Class,
        String Type,
        List<Vulnerability> Vulnerabilities
    ) {

        public static record Vulnerability(
            String vulnerabilityID,
            String pkgID,
            String pkgName,
            String installedVersion,
            String fixedVersion,
            String severity,
            List<String> references
        ) {}
    }
}
