<template>
  <div class="raamat-container">
    <div class="create-container">
      <input v-model="titleOfNewRaamat" type="text">
      <button @click="create">
        Lisa
      </button>
    </div>
    <div class="raamat-list-container">
      <raamat-list-item v-for="raamat in raamatud" :key="raamat.id" :raamat="raamat" v-on:delete="deleteItem" />
    </div>
  </div>
</template>

<script>
import RaamatListItem from '~/components/RaamatListItem.vue'
export default {
  components: {
    RaamatListItem
  },
  props: {
    raamatud: {
      type: Array,
      default () {
        return []
      }
    }
  },
  data () {
    return {
      titleOfNewRaamat: ''
    }
  },
  methods: {
    create() {
      this.raamatud.push({ id: this.titleOfNewRaamat, pealkiri: this.titleOfNewRaamat, broneeritud: false, laenutatud: false, kuup2ev: null })
      this.titleOfNewRaamat = ''
    },
    deleteItem (item) {
      this.raamatud.splice(this.raamatud.indexOf(item), 1)
    }
  }
}
</script>

<style lang="scss">
.raamat-container {
  width: 400px;
  margin: auto;
  margin-top: 50px;
  display: block;

  .create-container {
    width: 100%;
    height: 50px;
    box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);

    input {
      height: 50px;
      width: 250px;
      border: none;
      padding-left: 10px;
      font-family: "Quicksand", "Source Sans Pro", -apple-system,
        BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial,
        sans-serif;
      font-size: 18px;
      &:focus {
        outline: none;
      }
    }

    button {
      height: 45px;
      float: right;
      background: none;
      width: auto;
      margin: 0;
      border: none;
      cursor: pointer;
      text-align: right;
      padding-right: 20px;
      font-size: 18px;
      &:focus {
        outline: none;
      }
    }
  }
}
.raamat-list-container {
  width: 700px;
  margin: auto;
  margin-top: 50px;
  display: block;
  box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
}
</style>
