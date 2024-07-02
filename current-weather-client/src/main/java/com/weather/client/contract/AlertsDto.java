package com.weather.client.contract;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class AlertsDto extends AlertsResultDto{
    private String description;

    @JsonProperty("effective_local")
    private String effectiveLocal;

    @JsonProperty("effective_utc")
    private String effectiveUtc;

    @JsonProperty("ends_local")
    private String endsLocal;

    @JsonProperty("ends_utc")
    private String endsUtc;

    @JsonProperty("expires_local")
    private String expiresLocal;

    @JsonProperty("expires_utc")
    private String expiresUtc;

    @JsonProperty("onset_local")
    private String onsetLocal;

    @JsonProperty("onset_utc")
    private String onsetUtc;

    private List<String> regions;
    private String severity;
    private String title;
    private String uri;

    @Override
    public String toString() {
        return "Alert{" +
                "description='" + description + '\'' +
                ", effectiveLocal='" + effectiveLocal + '\'' +
                ", effectiveUtc='" + effectiveUtc + '\'' +
                ", endsLocal='" + endsLocal + '\'' +
                ", endsUtc='" + endsUtc + '\'' +
                ", expiresLocal='" + expiresLocal + '\'' +
                ", expiresUtc='" + expiresUtc + '\'' +
                ", onsetLocal='" + onsetLocal + '\'' +
                ", onsetUtc='" + onsetUtc + '\'' +
                ", regions=" + regions +
                ", severity='" + severity + '\'' +
                ", title='" + title + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}

