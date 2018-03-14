package com.hubspot.slack.client.models.interaction;

import org.junit.Test;

import com.hubspot.slack.client.jackson.ObjectMapperUtils;
import com.hubspot.slack.client.models.JsonLoader;

public class InteractiveLoadOptionsRequestTest {
  @Test
  public void itCanDeserRequest() throws Exception {
    String raw = JsonLoader.loadJsonFromFile("interactive_load_options_req.json");
    ObjectMapperUtils.mapper().readValue(raw, InteractiveLoadOptionsRequest.class);
  }
}
