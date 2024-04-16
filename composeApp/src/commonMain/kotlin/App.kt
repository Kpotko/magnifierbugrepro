import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var isShowDialog by remember { mutableStateOf(false) }
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = "hello world",
                onValueChange = {
                },
                label = { Text("Text") },
            )
            Button(onClick = {
                isShowDialog = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            ) {
                Text("Show Dialog")
            }
        }
        if (isShowDialog) {
            showDialog()
        }
    }
}

@Composable
fun showDialog(){
    AlertDialog(
        onDismissRequest = { },
        title = { Text("Dialog") },
        text = {
            OutlinedTextField(
                value = "hello world",
                onValueChange = {
                },
                label = { Text("Text") },
            )
        },
        confirmButton = {

        },
        dismissButton = {

        }
    )
}