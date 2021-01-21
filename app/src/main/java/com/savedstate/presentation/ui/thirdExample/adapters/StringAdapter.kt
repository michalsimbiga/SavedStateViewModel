package com.savedstate.presentation.ui.thirdExample.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.savedstate.databinding.ItemStringBinding

class StringAdapter : ListAdapter<String, StringAdapter.StringViewHolder>(
    ItemCallback
) {

    companion object {
        private val ItemCallback =
            object : DiffUtil.ItemCallback<String>() {
                override fun areItemsTheSame(
                    oldItem: String,
                    newItem: String
                ) = oldItem == newItem

                override fun areContentsTheSame(
                    oldItem: String,
                    newItem: String
                ) = oldItem == newItem
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemStringBinding.inflate(layoutInflater, parent, false)
        return StringViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) =
        holder.bind(getItem(position))

    inner class StringViewHolder(
        val binding: ItemStringBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(model: String) = with(binding) {
            text = model
            executePendingBindings()
        }
    }
}