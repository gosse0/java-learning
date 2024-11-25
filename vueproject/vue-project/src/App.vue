<template>
  <div id="app"><!-- 用于css -->
    <!-- <element-view></element-view> -->
     <emp-view></emp-view>

  </div>
</template>

<script>
import EmpView from './views/myWeb/EmpView.vue'
/* import ElementView from './views/element/ElementView.vue' */
export default {
  components: { EmpView },
  data:function(){
    return {
      message:"Hello Vue"
    }
  }
}
</script>


<style>/* css */

</style>
