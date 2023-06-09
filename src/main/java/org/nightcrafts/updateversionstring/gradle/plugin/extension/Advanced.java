package org.nightcrafts.updateversionstring.gradle.plugin.extension;

import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Optional;

public interface Advanced {

    @Optional
    Property<String> getVersionLineRegex();
    @Optional
    Property<String> getVersionParseRegex();
    @Optional
    Property<String> getVersionFormatTemplate();
    @Optional
    Property<String> getVersionLineTemplate();
}
