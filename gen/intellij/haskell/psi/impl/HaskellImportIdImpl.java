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

public class HaskellImportIdImpl extends HaskellCompositeElementImpl implements HaskellImportId {

  public HaskellImportIdImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitImportId(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public HaskellCname getCname() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellCname.class));
  }

  @Override
  @NotNull
  public List<HaskellCnameDotDot> getCnameDotDotList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellCnameDotDot.class);
  }

}
