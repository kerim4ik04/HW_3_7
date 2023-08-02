package com.example.hw_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_3_7.databinding.FragmentSekondBinding

class SekondFragment : Fragment() {
    lateinit var dataFromFirstFragment: Prise
    lateinit var binding: FragmentSekondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSekondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromFirstFragment= arguments?.getSerializable("key") as Prise
        binding.tvNameName.text = dataFromFirstFragment.alive
        binding.tvNamenNamen.text = dataFromFirstFragment.name
    }
}

