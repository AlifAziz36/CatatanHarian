package com.example.tugasutsgenap2023akbif410120136.base;

//10120136, Alif Aziz Alviansyah, IF4
public interface IPresenter<T extends IView, IView> {
    void onAttach(T view);
    void onDetach();
}
