package ada.tech.tenthirty.tvpackages.payloads;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InvoiceRequest {
  @JsonProperty("listPackages")
  private List<PackageRequest> listPackages;
}
