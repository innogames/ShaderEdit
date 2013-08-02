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
package glsltool.psi;

import com.intellij.psi.tree.IElementType;
import glsltool.GLSLLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: luca
 * Date: 02.08.13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class MyTokenType extends IElementType {
  public MyTokenType(@NotNull @NonNls String debugName) {
	super(debugName, GLSLLanguage.INSTANCE);
  }
}
