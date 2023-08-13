package com.mikitamirosha.exchawave.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstFragment : Fragment() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                FirstFragmentContent(viewModel)
            }
        }
    }
}

@Composable
fun FirstFragmentContent(viewModel: MainViewModel) {
    val items by viewModel.items.observeAsState(emptyList())

    LazyColumn {
        items(items) { item ->
            Text(text = item.name)
        }
    }
}