println "Executing the archetype-pre-generate.groovy script...";

// overwrite some properties before generating the files
request.getProperties().put("property-with-default-1", "custom-value-1")
request.getProperties().put("property-without-default-1", "custom-value-2")

// set new property
request.getProperties().put("custom-property", "custom-value-3")
