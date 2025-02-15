// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static intellij.haskell.psi.HaskellTypes.*;
import intellij.haskell.psi.*;

public class HaskellCdeclsImpl extends HaskellCompositeElementImpl implements HaskellCdecls {

  public HaskellCdeclsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitCdecls(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HaskellCdeclDataDeclaration> getCdeclDataDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellCdeclDataDeclaration.class);
  }

  @Override
  @NotNull
  public List<HaskellDataDeclaration> getDataDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellDataDeclaration.class);
  }

  @Override
  @NotNull
  public List<HaskellDefaultDeclaration> getDefaultDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellDefaultDeclaration.class);
  }

  @Override
  @NotNull
  public List<HaskellDotDot> getDotDotList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellDotDot.class);
  }

  @Override
  @NotNull
  public List<HaskellInstanceDeclaration> getInstanceDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellInstanceDeclaration.class);
  }

  @Override
  @NotNull
  public List<HaskellNewtypeDeclaration> getNewtypeDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellNewtypeDeclaration.class);
  }

  @Override
  @NotNull
  public List<HaskellPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellPragma.class);
  }

  @Override
  @NotNull
  public List<HaskellQName> getQNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellQName.class);
  }

  @Override
  @NotNull
  public List<HaskellReservedId> getReservedIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellReservedId.class);
  }

  @Override
  @NotNull
  public List<HaskellTextLiteral> getTextLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTextLiteral.class);
  }

  @Override
  @NotNull
  public List<HaskellTypeDeclaration> getTypeDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTypeDeclaration.class);
  }

  @Override
  @NotNull
  public List<HaskellTypeFamilyDeclaration> getTypeFamilyDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTypeFamilyDeclaration.class);
  }

  @Override
  @NotNull
  public List<HaskellTypeSignature> getTypeSignatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTypeSignature.class);
  }

}
