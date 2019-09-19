//
// Created by TY on 2019-09-12.
//
#include "com_ty_android_ndkdemo_NdkLib.h"

JNIEXPORT jstring JNICALL Java_com_ty_android_ndkdemo_NdkLib_getStringFromNdk(JNIEnv *env, jobject obj)
{
    return (*env)->NewStringUTF(env, "I'm from NdkLib");
}

