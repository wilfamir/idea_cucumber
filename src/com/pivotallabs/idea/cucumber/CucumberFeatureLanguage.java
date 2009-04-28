package com.pivotallabs.idea.cucumber;

import com.intellij.lang.Language;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;

/**
 * Created by IntelliJ IDEA.
 * User: stevend
 * Date: Apr 27, 2009
 * Time: 8:25:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class CucumberFeatureLanguage extends Language {
  public CucumberFeatureLanguage() {
    super("CucumberFeature", "text/x-feature"); 
  }

  public SyntaxHighlighter getSyntaxHighlighter(Project project) {
    return new FeatureSyntaxHighligher();
  }

}