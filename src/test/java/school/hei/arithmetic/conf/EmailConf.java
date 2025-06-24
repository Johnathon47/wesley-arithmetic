package school.hei.arithmetic.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import school.hei.arithmetic.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
