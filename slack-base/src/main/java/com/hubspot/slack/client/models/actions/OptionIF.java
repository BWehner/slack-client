package com.hubspot.slack.client.models.actions;

import java.util.Optional;

import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.SlackOption;

@Immutable
@HubSpotStyle
public interface OptionIF extends SlackOption {
  Optional<String> getText();
}

