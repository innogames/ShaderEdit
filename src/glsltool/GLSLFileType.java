/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package glsltool;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: luca
 * Date: 19.07.13
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */
public class GLSLFileType extends LanguageFileType{
  public static final GLSLFileType INSTANCE = new GLSLFileType();

  private GLSLFileType() {
    super(GLSLLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "GLSL file";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "OpenGL Shader Language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "glsl";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return GLSLIcons.FILE;
  }
}
