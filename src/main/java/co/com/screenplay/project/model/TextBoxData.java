package co.com.screenplay.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TextBoxData {

    @Builder.Default
    private String userName = "Edwin Higuera";

    @Builder.Default
    private String userEmail = "Edwin123@gmail.com";

    @Builder.Default
    private String currentAddress = "Tr35#7a-13";

    @Builder.Default
    private String permanentAddress = "C34#756-23";
}
