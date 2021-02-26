package com.icesmith.simplecomposeflowrow.sample

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.icesmith.simplecomposeflowrow.SimpleFlowRow

@Preview(
  widthDp = 16,
  heightDp = 16,
  showBackground = true,
  backgroundColor = 0xffffff
)
@Composable
fun PreviewEmptySimpleFlowRow() {
  SimpleFlowRow {}
}

@Preview(
  widthDp = 200,
  showBackground = true,
  backgroundColor = 0xffffff
)
@Composable
fun PreviewCenteredSimpleFlowRow(
  @PreviewParameter(AlignmentProvider::class) alignment: Alignment.Horizontal
) {
  SimpleFlowRow(
    alignment = alignment,
    horizontalGap = 16.dp,
    verticalGap = 8.dp
  ) {
    for (tag in sampleTags) {
      Text(
        text = "#$tag",
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
      )
    }
  }
}

class AlignmentProvider : PreviewParameterProvider<Alignment.Horizontal> {
  override val values: Sequence<Alignment.Horizontal> = sequenceOf(
    Alignment.Start,
    Alignment.CenterHorizontally,
    Alignment.End
  )
}
